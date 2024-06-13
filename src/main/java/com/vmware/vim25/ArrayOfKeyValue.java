package com.vmware.vim25;

import com.vmware.vim25.ArrayOfKeyValue;
import com.vmware.vim25.KeyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyValue", propOrder = {"keyValue"})
public class ArrayOfKeyValue {
  @XmlElement(name = "KeyValue")
  protected List<KeyValue> keyValue;
  
  public List<KeyValue> getKeyValue() {
    if (this.keyValue == null)
      this.keyValue = new ArrayList<>(); 
    return this.keyValue;
  }
}
