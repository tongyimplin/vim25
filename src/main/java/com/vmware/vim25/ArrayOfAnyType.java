package com.vmware.vim25;

import com.vmware.vim25.ArrayOfAnyType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAnyType", propOrder = {"anyType"})
public class ArrayOfAnyType {
  protected List<Object> anyType;
  
  public List<Object> getAnyType() {
    if (this.anyType == null)
      this.anyType = new ArrayList(); 
    return this.anyType;
  }
}
