package com.vmware.vim25;

import com.vmware.vim25.ArrayOfByte;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfByte", propOrder = {"_byte"})
public class ArrayOfByte {
  @XmlElement(name = "byte", type = Byte.class)
  protected List<Byte> _byte;
  
  public List<Byte> getByte() {
    if (this._byte == null)
      this._byte = new ArrayList<>(); 
    return this._byte;
  }
}
