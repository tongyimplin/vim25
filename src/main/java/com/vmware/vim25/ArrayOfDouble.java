package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDouble;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDouble", propOrder = {"_double"})
public class ArrayOfDouble {
  @XmlElement(name = "double", type = Double.class)
  protected List<Double> _double;
  
  public List<Double> getDouble() {
    if (this._double == null)
      this._double = new ArrayList<>(); 
    return this._double;
  }
}
