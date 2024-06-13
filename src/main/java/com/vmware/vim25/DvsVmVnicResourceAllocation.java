package com.vmware.vim25;

import com.vmware.vim25.DvsVmVnicResourceAllocation;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsVmVnicResourceAllocation", propOrder = {"reservationQuota"})
public class DvsVmVnicResourceAllocation extends DynamicData {
  protected Long reservationQuota;
  
  public Long getReservationQuota() {
    return this.reservationQuota;
  }
  
  public void setReservationQuota(Long paramLong) {
    this.reservationQuota = paramLong;
  }
}
