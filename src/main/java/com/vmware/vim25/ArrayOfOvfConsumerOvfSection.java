package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOvfConsumerOvfSection;
import com.vmware.vim25.OvfConsumerOvfSection;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOvfConsumerOvfSection", propOrder = {"ovfConsumerOvfSection"})
public class ArrayOfOvfConsumerOvfSection {
  @XmlElement(name = "OvfConsumerOvfSection")
  protected List<OvfConsumerOvfSection> ovfConsumerOvfSection;
  
  public List<OvfConsumerOvfSection> getOvfConsumerOvfSection() {
    if (this.ovfConsumerOvfSection == null)
      this.ovfConsumerOvfSection = new ArrayList<>(); 
    return this.ovfConsumerOvfSection;
  }
}
