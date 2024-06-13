package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostInternetScsiHbaParamValue;
import com.vmware.vim25.HostInternetScsiHbaParamValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostInternetScsiHbaParamValue", propOrder = {"hostInternetScsiHbaParamValue"})
public class ArrayOfHostInternetScsiHbaParamValue {
  @XmlElement(name = "HostInternetScsiHbaParamValue")
  protected List<HostInternetScsiHbaParamValue> hostInternetScsiHbaParamValue;
  
  public List<HostInternetScsiHbaParamValue> getHostInternetScsiHbaParamValue() {
    if (this.hostInternetScsiHbaParamValue == null)
      this.hostInternetScsiHbaParamValue = new ArrayList<>(); 
    return this.hostInternetScsiHbaParamValue;
  }
}
