package com.vmware.vim25;

import com.vmware.vim25.DatastoreSummary;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatastoreSummary", propOrder = {"datastore", "name", "url", "capacity", "freeSpace", "uncommitted", "accessible", "multipleHostAccess", "type", "maintenanceMode"})
public class DatastoreSummary extends DynamicData {
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected String url;
  
  protected long capacity;
  
  protected long freeSpace;
  
  protected Long uncommitted;
  
  protected boolean accessible;
  
  protected Boolean multipleHostAccess;
  
  @XmlElement(required = true)
  protected String type;
  
  protected String maintenanceMode;
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public String getUrl() {
    return this.url;
  }
  
  public void setUrl(String paramString) {
    this.url = paramString;
  }
  
  public long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(long paramLong) {
    this.capacity = paramLong;
  }
  
  public long getFreeSpace() {
    return this.freeSpace;
  }
  
  public void setFreeSpace(long paramLong) {
    this.freeSpace = paramLong;
  }
  
  public Long getUncommitted() {
    return this.uncommitted;
  }
  
  public void setUncommitted(Long paramLong) {
    this.uncommitted = paramLong;
  }
  
  public boolean isAccessible() {
    return this.accessible;
  }
  
  public void setAccessible(boolean paramBoolean) {
    this.accessible = paramBoolean;
  }
  
  public Boolean isMultipleHostAccess() {
    return this.multipleHostAccess;
  }
  
  public void setMultipleHostAccess(Boolean paramBoolean) {
    this.multipleHostAccess = paramBoolean;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
  
  public String getMaintenanceMode() {
    return this.maintenanceMode;
  }
  
  public void setMaintenanceMode(String paramString) {
    this.maintenanceMode = paramString;
  }
}
