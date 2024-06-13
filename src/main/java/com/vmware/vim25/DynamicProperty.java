package com.vmware.vim25;

import com.vmware.vim25.DynamicProperty;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicProperty", propOrder = {"name", "val"})
public class DynamicProperty {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected Object val;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Object getVal() {
    return this.val;
  }
  
  public void setVal(Object paramObject) {
    this.val = paramObject;
  }
}
