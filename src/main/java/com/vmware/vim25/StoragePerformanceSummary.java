package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.StoragePerformanceSummary;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StoragePerformanceSummary", propOrder = {"interval", "percentile", "datastoreReadLatency", "datastoreWriteLatency", "datastoreVmLatency", "datastoreReadIops", "datastoreWriteIops", "siocActivityDuration"})
public class StoragePerformanceSummary extends DynamicData {
  protected int interval;
  
  @XmlElement(type = Integer.class)
  protected List<Integer> percentile;
  
  @XmlElement(type = Double.class)
  protected List<Double> datastoreReadLatency;
  
  @XmlElement(type = Double.class)
  protected List<Double> datastoreWriteLatency;
  
  @XmlElement(type = Double.class)
  protected List<Double> datastoreVmLatency;
  
  @XmlElement(type = Double.class)
  protected List<Double> datastoreReadIops;
  
  @XmlElement(type = Double.class)
  protected List<Double> datastoreWriteIops;
  
  protected int siocActivityDuration;
  
  public int getInterval() {
    return this.interval;
  }
  
  public void setInterval(int paramInt) {
    this.interval = paramInt;
  }
  
  public List<Integer> getPercentile() {
    if (this.percentile == null)
      this.percentile = new ArrayList<>(); 
    return this.percentile;
  }
  
  public List<Double> getDatastoreReadLatency() {
    if (this.datastoreReadLatency == null)
      this.datastoreReadLatency = new ArrayList<>(); 
    return this.datastoreReadLatency;
  }
  
  public List<Double> getDatastoreWriteLatency() {
    if (this.datastoreWriteLatency == null)
      this.datastoreWriteLatency = new ArrayList<>(); 
    return this.datastoreWriteLatency;
  }
  
  public List<Double> getDatastoreVmLatency() {
    if (this.datastoreVmLatency == null)
      this.datastoreVmLatency = new ArrayList<>(); 
    return this.datastoreVmLatency;
  }
  
  public List<Double> getDatastoreReadIops() {
    if (this.datastoreReadIops == null)
      this.datastoreReadIops = new ArrayList<>(); 
    return this.datastoreReadIops;
  }
  
  public List<Double> getDatastoreWriteIops() {
    if (this.datastoreWriteIops == null)
      this.datastoreWriteIops = new ArrayList<>(); 
    return this.datastoreWriteIops;
  }
  
  public int getSiocActivityDuration() {
    return this.siocActivityDuration;
  }
  
  public void setSiocActivityDuration(int paramInt) {
    this.siocActivityDuration = paramInt;
  }
}
