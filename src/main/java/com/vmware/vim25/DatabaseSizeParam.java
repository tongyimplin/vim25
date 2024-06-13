package com.vmware.vim25;

import com.vmware.vim25.DatabaseSizeParam;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.InventoryDescription;
import com.vmware.vim25.PerformanceStatisticsDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatabaseSizeParam", propOrder = {"inventoryDesc", "perfStatsDesc"})
public class DatabaseSizeParam extends DynamicData {
  @XmlElement(required = true)
  protected InventoryDescription inventoryDesc;
  
  protected PerformanceStatisticsDescription perfStatsDesc;
  
  public InventoryDescription getInventoryDesc() {
    return this.inventoryDesc;
  }
  
  public void setInventoryDesc(InventoryDescription paramInventoryDescription) {
    this.inventoryDesc = paramInventoryDescription;
  }
  
  public PerformanceStatisticsDescription getPerfStatsDesc() {
    return this.perfStatsDesc;
  }
  
  public void setPerfStatsDesc(PerformanceStatisticsDescription paramPerformanceStatisticsDescription) {
    this.perfStatsDesc = paramPerformanceStatisticsDescription;
  }
}
