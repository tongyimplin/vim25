package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.OpaqueNetworkCapability;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OpaqueNetworkCapability", propOrder = {"networkReservationSupported"})
public class OpaqueNetworkCapability extends DynamicData {
  protected boolean networkReservationSupported;
  
  public boolean isNetworkReservationSupported() {
    return this.networkReservationSupported;
  }
  
  public void setNetworkReservationSupported(boolean paramBoolean) {
    this.networkReservationSupported = paramBoolean;
  }
}
