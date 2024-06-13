package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.PropertyChange;
import com.vmware.vim25.PropertyChangeOp;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyChange", propOrder = {"name", "op", "val"})
public class PropertyChange extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected PropertyChangeOp op;
  
  protected Object val;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public PropertyChangeOp getOp() {
    return this.op;
  }
  
  public void setOp(PropertyChangeOp paramPropertyChangeOp) {
    this.op = paramPropertyChangeOp;
  }
  
  public Object getVal() {
    return this.val;
  }
  
  public void setVal(Object paramObject) {
    this.val = paramObject;
  }
}
