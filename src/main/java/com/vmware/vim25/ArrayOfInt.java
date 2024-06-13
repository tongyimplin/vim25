package com.vmware.vim25;

import com.vmware.vim25.ArrayOfInt;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfInt", propOrder = {"_int"})
public class ArrayOfInt {
  @XmlElement(name = "int", type = Integer.class)
  protected List<Integer> _int;
  
  public List<Integer> getInt() {
    if (this._int == null)
      this._int = new ArrayList<>(); 
    return this._int;
  }
}
