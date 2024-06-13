package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.ElementDescription;
import com.vmware.vim25.OptionType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChoiceOption", propOrder = {"choiceInfo", "defaultIndex"})
public class ChoiceOption extends OptionType {
  @XmlElement(required = true)
  protected List<ElementDescription> choiceInfo;
  
  protected Integer defaultIndex;
  
  public List<ElementDescription> getChoiceInfo() {
    if (this.choiceInfo == null)
      this.choiceInfo = new ArrayList<>(); 
    return this.choiceInfo;
  }
  
  public Integer getDefaultIndex() {
    return this.defaultIndex;
  }
  
  public void setDefaultIndex(Integer paramInteger) {
    this.defaultIndex = paramInteger;
  }
}
