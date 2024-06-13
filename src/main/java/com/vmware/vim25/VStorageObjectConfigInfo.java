package com.vmware.vim25;

import com.vmware.vim25.BaseConfigInfo;
import com.vmware.vim25.ID;
import com.vmware.vim25.VStorageObjectConfigInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VStorageObjectConfigInfo", propOrder = {"capacityInMB", "consumptionType", "consumerId"})
public class VStorageObjectConfigInfo extends BaseConfigInfo {
  protected long capacityInMB;
  
  protected List<String> consumptionType;
  
  protected List<ID> consumerId;
  
  public long getCapacityInMB() {
    return this.capacityInMB;
  }
  
  public void setCapacityInMB(long paramLong) {
    this.capacityInMB = paramLong;
  }
  
  public List<String> getConsumptionType() {
    if (this.consumptionType == null)
      this.consumptionType = new ArrayList<>(); 
    return this.consumptionType;
  }
  
  public List<ID> getConsumerId() {
    if (this.consumerId == null)
      this.consumerId = new ArrayList<>(); 
    return this.consumerId;
  }
}
