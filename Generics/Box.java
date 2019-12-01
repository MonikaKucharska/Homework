package pl.itacademy.lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Box<T> {
   private T item;

   private  List<T> list = new ArrayList<T>();

   public Box(){ }

   public Box(T item){
       this.item = item;
   }

   T getItem(){
       return item;
   }

   public void add(T item){
       list.add(item);
   }

   public List<T> getList() {
       return list;
   }

    @Override
    public String toString() {
        return "Box{" +
                "list=" + list +
                '}';
    }
}
