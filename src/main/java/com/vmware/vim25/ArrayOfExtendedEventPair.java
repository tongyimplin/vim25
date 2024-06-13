package com.vmware.vim25;

import com.vmware.vim25.ArrayOfExtendedEventPair;
import com.vmware.vim25.ExtendedEventPair;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfExtendedEventPair", propOrder = {"extendedEventPair"})
public class ArrayOfExtendedEventPair {
  @XmlElement(name = "ExtendedEventPair")
  protected List<ExtendedEventPair> extendedEventPair;
  
  public List<ExtendedEventPair> getExtendedEventPair() {
    if (this.extendedEventPair == null)
      this.extendedEventPair = new ArrayList<>(); 
    return this.extendedEventPair;
  }
}
