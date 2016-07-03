package models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

/**
 * Created by evan on 7/1/16.
 */
public class CustomerEnvelope {
    @JsonProperty
    private ArrayList<Customer> customers;

    public CustomerEnvelope() {
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    @Override
    public String toString() {
        return "CustomerEnvelope{" +
                "customers=" + customers +
                '}';
    }
}
