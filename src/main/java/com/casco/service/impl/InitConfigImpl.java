package com.casco.service.impl;

import com.casco.mapper.business.TAllMapper;
import com.casco.mapper.business.TConsoleMapper;
import com.casco.mapper.business.TStationMapper;
import com.casco.pojo.*;
import com.casco.service.InitConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@Service
public class InitConfigImpl implements InitConfig {



    @Autowired
    private TAllMapper tAllMapper;
    @Autowired
    private  TStationMapper tStationMapper;
    @Autowired
    private  TConsoleMapper tConsoleMapper;

  /*  private static Map<Integer,String> map = new HashMap<Integer, String>();
    private  static  List cruntimeslist  =new ArrayList<Cruntime>();
    private  static  List  entryslist = new ArrayList<Entry>();
    private static  List lineslist = new ArrayList<Line>();
    private  static  List stationslist =new<Station> ArrayList();*/
    private static List tAlls = new ArrayList<TAll>();
    private static List tStations = new ArrayList<TStation>();
    private  static  List tConsoles = new ArrayList<TConsole>();
    private static Map<Integer,String>staMaps =new HashMap<Integer,String>();
    private static Map<Integer,TLinedef> linedefMap = new HashMap<Integer,TLinedef>();
    private static Map<Integer,TEntry> tEntryMap = new HashMap<Integer,TEntry>();




    List<Cruntime> cruntimeList = new ArrayList<Cruntime>();

    public static boolean isInteger(String str) {
        Pattern pattern = Pattern.compile("^[-\\+]?[\\d]*$");
        return pattern.matcher(str).matches();
    }

    @Override
    public  void   readConfig(){

/*        TEntryExample tEntryExample = new TEntryExample();
        TEntryExample.Criteria criteria = tEntryExample.createCriteria();
        criteria.andAbsnumberBetween(800,805);
        List<TEntry> tEntryList =  tEntryMapper.selectByExample(tEntryExample);
        System.out.println("InitConfigImpl.readConfig:" + tEntryList.size());
        for (TEntry tEntry : tEntryList){
            System.out.println(tEntry);
        }*/

        File file = new File("D:\\RunTimeEditor\\path.config");
        BufferedReader reader = null;
        String path = null;
        String resault = "";
        try {

            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            while ((tempString = reader.readLine()) != null) {
                // 显示行号
                String[] splits = tempString.split("=");
                if("path".equals(splits[0])){
                    path = splits[1].trim();
                    String []strings = path.split("\\\\");
                    for (String string : strings ){
                        resault= resault+string+"/";
                    }
                }
            }
            //读取配置文件入库
            readEinty(resault + "data/entity.cfg");
            readGpc(resault + "data/gpc.def");
            readTg(resault + "data/tg.def");
            readEntry(resault + "data/entry.cfg");
            readRuntime(resault + "data/run_time.txt");
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {

                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
        return  ;
    }


    @Override
    public  void readGpc(String filename) {
        System.out.println(filename);
        File file = new File(filename);
        InputStreamReader read = null;
        BufferedReader reader = null;
        String encoding="GBK";
        try {
            //以GBK方式读取gpc.def
            read = new InputStreamReader( new FileInputStream(file),encoding);
            reader = new BufferedReader(read);

            String tempString = null;
            TStationExample tStationExample = new TStationExample();
            tStationExample.createCriteria().andStationidIsNotNull();
            tStationMapper.deleteByExample(tStationExample);
            TConsoleExample tConsoleExample = new TConsoleExample();
            tConsoleExample.createCriteria().andConsoleidIsNotNull();
            tConsoleMapper.deleteByExample(tConsoleExample);

            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {

                String[] splits = tempString.split("=");

                if ("[SECTION]".equals(splits[0].trim())){
                    String[] strings = splits[1].split(",");
                    int consoleId = Integer.parseInt(strings[0].trim());
                    String consoleName = strings[1].trim();
                    TConsole tConsole = new TConsole();
                    tConsole.setConsoleid(consoleId);
                    tConsole.setConsolename(consoleName);
                    tConsoles.add(tConsole);
                    String[]  staIds = strings[2].trim().split("/");
                    for ( int id =1;id<staIds.length;id++){
                        if (isInteger(staIds[id].trim())){
                            //Station station = new Station();
                            TStation tStation =new TStation();
                            tStation.setConsoleid(consoleId);
                            tStation.setConsolename(consoleName);
                            tStation.setStationid(Integer.parseInt(staIds[id].trim()));
                            tStation.setStaionname(staMaps.get(Integer.parseInt(staIds[id].trim())));
                            //System.out.println(station);
                            //runtimeMapper.insertStation(station);
                            tStations.add(tStation);
                        }else {
                            int fromSta = Integer.parseInt(staIds[id].split("-")[0].trim());
                            int endSta = Integer.parseInt(staIds[id].split("-")[1].trim());
                            for (int i=fromSta;i<=endSta;i++){
                                TStation tStation =new TStation();
                                tStation.setConsoleid(consoleId);
                                tStation.setConsolename(consoleName);
                                tStation.setStationid(i);
                                tStation.setStaionname(staMaps.get(i));
                                //System.out.println(tStation);
                                //runtimeMapper.insertStation(station);
                                tStations.add(tStation);
                            }

                        }
                    }

                }

            }
            tStationMapper.insertListStaion(tStations);
            tConsoleMapper.insertListConsole(tConsoles);

            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

    }

    @Override
    public   void readEinty(String filename) {
        System.out.println(filename);
        File file = new File(filename);
        InputStreamReader read = null;
        BufferedReader reader = null;
        String encoding="GBK";
        try {
            //以GBK方式读取gpc.def
            read = new InputStreamReader( new FileInputStream(file),encoding);
            reader = new BufferedReader(read);

            String tempString = null;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {

                String[] splits = tempString.split("\\s+");

                if (splits.length>3 && splits[1].startsWith("=lirc")){
                    if(isInteger(splits[1].substring(5).split(",")[0]))
                    {
                        int key = Integer.parseInt(splits[1].substring(5).split(",")[0]);
                        staMaps.put(key,splits[2].split(",")[0]);
                    }

                }
                staMaps.put(0,"端点站");
            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

    }


    @Override
    public void readTg(String filename) {
        System.out.println(filename);
        File file = new File(filename);
        InputStreamReader read = null;
        BufferedReader reader = null;
        String encoding="GBK";
        try {
            //以GBK方式读取gpc.def
            read = new InputStreamReader( new FileInputStream(file),encoding);
            reader = new BufferedReader(read);
            String tempString = null;

            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {

                String[] splits = tempString.split("=");

                if ("[LINE_DEFINE]".equals(splits[0].trim())){
                    String[] strings = splits[1].trim().split(",");

                    if (strings.length >=6){
                        TLinedef tLinedef = new TLinedef();
                        tLinedef.setAbsnumber(Integer.parseInt(strings[0].trim()));
                        tLinedef.setAbsname(strings[1].trim());
                        tLinedef.setCkflag(Integer.parseInt(strings[2].trim()));
                        tLinedef.setFromsta(Integer.parseInt(strings[3].trim()));
                        tLinedef.setTosta(Integer.parseInt(strings[4].trim()));
                        tLinedef.setDirection(Integer.parseInt(strings[5].trim()));
                        //runtimeMapper.insertLine(line);
                        //System.out.println(tLinedef);
                        //tLinedefs.add(tLinedef);
                        linedefMap.put(tLinedef.getAbsnumber(),tLinedef);
                    }
                }



            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

    @Override
    public void readEntry(String filename) {
        File file = new File(filename);
        InputStreamReader read = null;
        BufferedReader reader = null;
        String encoding="GBK";
        try {
            //以GBK方式读取gpc.def
            read = new InputStreamReader( new FileInputStream(file),encoding);
            reader = new BufferedReader(read);
            String tempString = null;
            int stationId = 0;
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {

                String[] splits = tempString.split(",");

                if (splits[0].trim().startsWith("STATION_ID")){
                    stationId=Integer.parseInt(splits[0].split("=")[1].trim());

                }else if (splits[0].trim().startsWith("ENTRY")){
                    TEntry tEntry = new TEntry();
                    tEntry.setStationid(stationId);
                    tEntry.setStationentry(Integer.parseInt(splits[0].split("=")[1].trim()));
                    tEntry.setAbsnumber(Integer.parseInt(splits[1].split("=")[1].trim()));
                    tEntry.setDirection(Integer.parseInt(splits[2].split("=")[1].trim()));
                    //runtimeMapper.insertEntry(entry);
                    //System.out.println(tEntry);
                    tEntryMap.put(tEntry.getStationid()*tEntry.getAbsnumber(),tEntry);

                }



            }
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }
    }

    @Override
    public  void readRuntime(String filename) {
        System.out.println(filename);
        File file = new File(filename);
        BufferedReader reader = null;




        try {

            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            TAllExample tAllExample = new TAllExample();
            tAllExample.createCriteria().andAbsnumberIsNotNull();
            int temp = tAllMapper.deleteByExample(tAllExample);
            System.out.println("InitConfigImpl.readRuntime::::::::删除长度" +  temp);
            // 一次读入一行，直到读入null为文件结束
            while ((tempString = reader.readLine()) != null) {

                String[] splits = tempString.split(",");
                TAll tAll = new TAll();

                for (String split : splits){
                    // System.out.print(split);
                    String[] str = split.split("=");
                    //System.out.print(str);
                    switch (str[0].trim()){
                        case "ABS_NUMBER":
                            tAll.setAbsnumber(Integer.parseInt(str[1].trim())); break;
                        case "DIRECTION":
                            tAll.setRuntimedirection(Integer.parseInt(str[1].trim())); break;
                        case "TYPE":
                            tAll.setTraintype(Integer.parseInt(str[1].trim())); break;
                        case "STOP_TIME":
                            tAll.setStoptime(str[1].trim()); break;
                        case "START_TIME":
                            tAll.setStarttime(str[1].trim()); break;
                        case "RUN_TIME":
                            tAll.setRuntime(str[1].trim()); break;
                        default:  break;
                    }



                }

                if (tAll.getAbsnumber()!= null){
                    TLinedef tLinedef = linedefMap.get(tAll.getAbsnumber());
                    if (tLinedef == null){
                        tAll.setFromstaid(0);
                        tAll.setTostaid(0);
                        tAll.setAbsdirection(0);
                        tAll.setAbsname("已废弃");
                        tAll.setFromstaname("已废弃");
                        tAll.setTostaname("已废弃");
                        tAll.setInentry(0);
                        tAll.setOutentry(0);

                    }else {
                        tAll.setFromstaid(tLinedef.getFromsta());
                        tAll.setTostaid(tLinedef.getTosta());
                        tAll.setAbsdirection(tLinedef.getDirection());
                        tAll.setAbsname(tLinedef.getAbsname());

                        String fromStaname=(tAll.getFromstaid()==0)?"端点站":staMaps.get(tAll.getFromstaid());
                        String toStaname=(tAll.getTostaid()==0)?"端点站":staMaps.get(tAll.getTostaid());
                        tAll.setFromstaname(fromStaname);
                        tAll.setTostaname(toStaname);

                        int inEntryKey = tAll.getAbsnumber()*tAll.getFromstaid();
                        int outEntryKey = tAll.getAbsnumber()*tAll.getTostaid();
                        int inEntry = (inEntryKey == 0)?0:tEntryMap.get(inEntryKey)==null?0:tEntryMap.get(inEntryKey).getStationentry();
                        int outEntry = (outEntryKey == 0)?0:tEntryMap.get(outEntryKey)==null?0:tEntryMap.get(outEntryKey).getStationentry();
                        tAll.setInentry(inEntry);
                        tAll.setOutentry(outEntry);
                    }

                    //System.out.println(tAll);
                    tAlls.add(tAll);
                }
            }
            System.out.println("InitConfigImpl.readRuntime::::::::导入长度tAlls.size()"+ tAlls.size());
            tAllMapper.insertListTall(tAlls);
            reader.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e1) {
                }
            }
        }

    }





}
