package com.vmware.vim25;

import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.OptionDef;
import com.vmware.vim25.OptionType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OptionDef", propOrder = {"optionType"})
public class OptionDef extends ElementDescription {
  @XmlElement(required = true)
  protected OptionType optionType;
  
  public OptionType getOptionType() {
    return this.optionType;
  }
  
  public void setOptionType(OptionType paramOptionType) {
    this.optionType = paramOptionType;
  }
}
