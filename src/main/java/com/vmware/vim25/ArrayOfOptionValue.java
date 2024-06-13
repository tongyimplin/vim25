package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOptionValue;
import com.vmware.vim25.OptionValue;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOptionValue", propOrder = {"optionValue"})
public class ArrayOfOptionValue {
  @XmlElement(name = "OptionValue")
  protected List<OptionValue> optionValue;
  
  public List<OptionValue> getOptionValue() {
    if (this.optionValue == null)
      this.optionValue = new ArrayList<>(); 
    return this.optionValue;
  }
}
