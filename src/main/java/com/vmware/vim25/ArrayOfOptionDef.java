package com.vmware.vim25;

import com.vmware.vim25.ArrayOfOptionDef;
import com.vmware.vim25.OptionDef;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfOptionDef", propOrder = {"optionDef"})
public class ArrayOfOptionDef {
  @XmlElement(name = "OptionDef")
  protected List<OptionDef> optionDef;
  
  public List<OptionDef> getOptionDef() {
    if (this.optionDef == null)
      this.optionDef = new ArrayList<>(); 
    return this.optionDef;
  }
}
