package com.vmware.vim25;

import com.vmware.vim25.HostDateTimeSystemTimeZone;
import com.vmware.vim25.QueryAvailableTimeZonesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "QueryAvailableTimeZonesResponse")
public class QueryAvailableTimeZonesResponse {
  protected List<HostDateTimeSystemTimeZone> returnval;
  
  public List<HostDateTimeSystemTimeZone> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
