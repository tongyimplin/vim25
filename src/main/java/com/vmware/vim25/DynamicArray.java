package com.vmware.vim25;

import com.vmware.vim25.DynamicArray;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DynamicArray", propOrder = {"val"})
public class DynamicArray {
  @XmlElement(required = true)
  protected List<Object> val;
  
  public List<Object> getVal() {
    if (this.val == null)
      this.val = new ArrayList(); 
    return this.val;
  }
}
