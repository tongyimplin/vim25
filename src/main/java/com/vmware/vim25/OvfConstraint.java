package com.vmware.vim25;

import com.vmware.vim25.OvfConstraint;
import com.vmware.vim25.OvfDiskOrderConstraint;
import com.vmware.vim25.OvfHostResourceConstraint;
import com.vmware.vim25.OvfInvalidPackage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfConstraint", propOrder = {"name"})
@XmlSeeAlso({OvfHostResourceConstraint.class, OvfDiskOrderConstraint.class})
public class OvfConstraint extends OvfInvalidPackage {
  @XmlElement(required = true)
  protected String name;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
