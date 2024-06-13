package com.vmware.vim25;

import com.vmware.vim25.ArrayOfKeyAnyValue;
import com.vmware.vim25.KeyAnyValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfKeyAnyValue", propOrder = {"keyAnyValue"})
public class ArrayOfKeyAnyValue {
  @XmlElement(name = "KeyAnyValue")
  protected List<KeyAnyValue> keyAnyValue;
  
  public List<KeyAnyValue> getKeyAnyValue() {
    if (this.keyAnyValue == null)
      this.keyAnyValue = new ArrayList<>(); 
    return this.keyAnyValue;
  }
}
