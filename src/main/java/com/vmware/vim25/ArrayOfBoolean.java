package com.vmware.vim25;

import com.vmware.vim25.ArrayOfBoolean;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBoolean", propOrder = {"_boolean"})
public class ArrayOfBoolean {
  @XmlElement(name = "boolean", type = Boolean.class)
  protected List<Boolean> _boolean;
  
  public List<Boolean> getBoolean() {
    if (this._boolean == null)
      this._boolean = new ArrayList<>(); 
    return this._boolean;
  }
}
