package com.vmware.vim25;

import com.vmware.vim25.HasPrivilegeOnEntityResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HasPrivilegeOnEntityResponse")
public class HasPrivilegeOnEntityResponse {
  @XmlElement(type = Boolean.class)
  protected List<Boolean> returnval;
  
  public List<Boolean> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
