package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostDateTimeSystemTimeZone;
import com.vmware.vim25.HostDateTimeSystemTimeZone;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostDateTimeSystemTimeZone", propOrder = {"hostDateTimeSystemTimeZone"})
public class ArrayOfHostDateTimeSystemTimeZone {
  @XmlElement(name = "HostDateTimeSystemTimeZone")
  protected List<HostDateTimeSystemTimeZone> hostDateTimeSystemTimeZone;
  
  public List<HostDateTimeSystemTimeZone> getHostDateTimeSystemTimeZone() {
    if (this.hostDateTimeSystemTimeZone == null)
      this.hostDateTimeSystemTimeZone = new ArrayList<>(); 
    return this.hostDateTimeSystemTimeZone;
  }
}
