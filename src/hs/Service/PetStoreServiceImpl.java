package hs.Service;

import hs.lanxi_DAO.JpaAccountDao;
import hs.lanxi_DAO.JpaItemDao;

import java.lang.reflect.Field;

public class PetStoreServiceImpl implements PetStoreService {
    private JpaAccountDao accountDao;
    private JpaItemDao itemDao;
    private String name;
    private Integer age;


    public void test() {
        try {
            Class aClass=Class.forName("hs.Service.PetStoreServiceImpl");
            PetStoreServiceImpl uclass=(PetStoreServiceImpl)aClass.newInstance();
            Field[] fields =aClass.getDeclaredFields();

            for(Field field:fields){
                String name=field.getName();
                System.out.println("name: "+name);
                field.setAccessible(true);
                if(name.equals("name")){
                    field.set(uclass,"zx");
                }else if(name.equals("age")){
                    field.set(uclass,1);
                }

            }

            System.out.println("name: "+uclass.name+" age: "+uclass.age);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        PetStoreServiceImpl petStoreService=new PetStoreServiceImpl();
        petStoreService.test();


    }



}
