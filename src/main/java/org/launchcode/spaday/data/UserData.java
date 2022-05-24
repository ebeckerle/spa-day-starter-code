package org.launchcode.spaday.data;

import org.launchcode.spaday.exceptions.UserDataException;
import org.launchcode.spaday.models.User;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class UserData {


    private static Map<Integer, User> users = new HashMap<>();

    public static void add(User user){
        users.put(user.getId(), user);
    }

    public static Collection<User> getAll(){
        return users.values();
    }

    public static User getById(Integer id){
        return users.get(id);
    }




//    private static ArrayList<User> users = new ArrayList<>();
//
//    public static void add(User user){
//        users.add(user);
//    }
//
//    public static ArrayList<User> getAll(){
//        return users;
//    }

//    public static User getById(Integer id){
//
////        Boolean userFound = null;
////        for (User user :
////                users) {
////            if(user.getId().equals(id)){
////                userFound = true;
////                return user;
////                break;
////            }else{
////                userFound = false;
////            }
////        }
////        if (Boolean.FALSE.equals(userFound)){
////            try {
////                throw new UserDataException("No such user in the Database");
////            }catch (UserDataException e){
////                e.printStackTrace();
////            }
////        }
//
//    }

}
