package com.vmware.vim25;

import com.vmware.vim25.GuestAuthNamedSubject;
import com.vmware.vim25.GuestAuthSubject;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuestAuthNamedSubject", propOrder = {"name"})
public class GuestAuthNamedSubject extends GuestAuthSubject {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
