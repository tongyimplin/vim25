package com.vmware.vim25;

import com.vmware.vim25.ArrayOfLong;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfLong", propOrder = {"_long"})
public class ArrayOfLong {
  @XmlElement(name = "long", type = Long.class)
  protected List<Long> _long;
  
  public List<Long> getLong() {
    if (this._long == null)
      this._long = new ArrayList<>(); 
    return this._long;
  }
}
