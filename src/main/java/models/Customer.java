package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.joda.time.DateTime;

import java.util.ArrayList;

/**
 * Created by evan on 7/1/16.
 */
public class Customer {
    @JsonProperty
    private String name;
    @JsonProperty
    private String id;
    @JsonProperty("deployment_date")
    private DateTime deploymentDate;
    @JsonProperty("conversion_types")
    private ArrayList<String > conversionTypes;
    @JsonProperty("datasource_ids")
    private ArrayList<String > datasourceIds;

    public Customer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DateTime getDeploymentDate() {
        return deploymentDate;
    }

    public void setDeploymentDate(DateTime deploymentDate) {
        this.deploymentDate = deploymentDate;
    }

    public ArrayList<String> getConversionTypes() {
        return conversionTypes;
    }

    public void setConversionTypes(ArrayList<String> conversionTypes) {
        this.conversionTypes = conversionTypes;
    }

    public ArrayList<String> getDatasourceIds() {
        return datasourceIds;
    }

    public void setDatasourceIds(ArrayList<String> datasourceIds) {
        this.datasourceIds = datasourceIds;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", deploymentDate=" + deploymentDate +
                ", conversionTypes=" + conversionTypes +
                ", datasourceIds=" + datasourceIds +
                '}';
    }
}
