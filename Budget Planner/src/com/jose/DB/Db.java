/**
 *
 * @author Ampatuan | Occeña | Henarios
 */
package com.jose.DB;

public class Db {
    
        public int Quantity;
        public double Total;
        public double Cost; 
        public String date;
        public String description;
                  
    public Db(int quantity, double cost, double total, String Date, String Description){
            this.Total = total;
            this.Quantity = quantity;
            this.Cost = cost;
            this.date = Date;
            this.description = Description;
            
        }
    
}
