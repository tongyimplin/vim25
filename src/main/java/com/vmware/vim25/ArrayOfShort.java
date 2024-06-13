package com.vmware.vim25;

import com.vmware.vim25.ArrayOfShort;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfShort", propOrder = {"_short"})
public class ArrayOfShort {
  @XmlElement(name = "short", type = Short.class)
  protected List<Short> _short;
  
  public List<Short> getShort() {
    if (this._short == null)
      this._short = new ArrayList<>(); 
    return this._short;
  }
}
