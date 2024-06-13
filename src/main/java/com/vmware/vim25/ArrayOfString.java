package com.vmware.vim25;

import com.vmware.vim25.ArrayOfString;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfString", propOrder = {"string"})
public class ArrayOfString {
  protected List<String> string;
  
  public List<String> getString() {
    if (this.string == null)
      this.string = new ArrayList<>(); 
    return this.string;
  }
}
