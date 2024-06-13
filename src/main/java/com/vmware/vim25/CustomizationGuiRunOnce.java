package com.vmware.vim25;

import com.vmware.vim25.CustomizationGuiRunOnce;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationGuiRunOnce", propOrder = {"commandList"})
public class CustomizationGuiRunOnce extends DynamicData {
  @XmlElement(required = true)
  protected List<String> commandList;
  
  public List<String> getCommandList() {
    if (this.commandList == null)
      this.commandList = new ArrayList<>(); 
    return this.commandList;
  }
}
