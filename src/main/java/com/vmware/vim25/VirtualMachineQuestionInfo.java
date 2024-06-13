package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineMessage;
import com.vmware.vim25.VirtualMachineQuestionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineQuestionInfo", propOrder = {"id", "text", "choice", "message"})
public class VirtualMachineQuestionInfo extends DynamicData {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String text;
  
  @XmlElement(required = true)
  protected ChoiceOption choice;
  
  protected List<VirtualMachineMessage> message;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String paramString) {
    this.text = paramString;
  }
  
  public ChoiceOption getChoice() {
    return this.choice;
  }
  
  public void setChoice(ChoiceOption paramChoiceOption) {
    this.choice = paramChoiceOption;
  }
  
  public List<VirtualMachineMessage> getMessage() {
    if (this.message == null)
      this.message = new ArrayList<>(); 
    return this.message;
  }
}
