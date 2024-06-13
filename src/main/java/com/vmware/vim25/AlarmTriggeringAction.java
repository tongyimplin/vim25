package com.vmware.vim25;

import com.vmware.vim25.Action;
import com.vmware.vim25.AlarmAction;
import com.vmware.vim25.AlarmTriggeringAction;
import com.vmware.vim25.AlarmTriggeringActionTransitionSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmTriggeringAction", propOrder = {"action", "transitionSpecs", "green2Yellow", "yellow2Red", "red2Yellow", "yellow2Green"})
public class AlarmTriggeringAction extends AlarmAction {
  @XmlElement(required = true)
  protected Action action;
  
  protected List<AlarmTriggeringActionTransitionSpec> transitionSpecs;
  
  @XmlElement(name = "green2yellow")
  protected boolean green2Yellow;
  
  @XmlElement(name = "yellow2red")
  protected boolean yellow2Red;
  
  @XmlElement(name = "red2yellow")
  protected boolean red2Yellow;
  
  @XmlElement(name = "yellow2green")
  protected boolean yellow2Green;
  
  public Action getAction() {
    return this.action;
  }
  
  public void setAction(Action paramAction) {
    this.action = paramAction;
  }
  
  public List<AlarmTriggeringActionTransitionSpec> getTransitionSpecs() {
    if (this.transitionSpecs == null)
      this.transitionSpecs = new ArrayList<>(); 
    return this.transitionSpecs;
  }
  
  public boolean isGreen2Yellow() {
    return this.green2Yellow;
  }
  
  public void setGreen2Yellow(boolean paramBoolean) {
    this.green2Yellow = paramBoolean;
  }
  
  public boolean isYellow2Red() {
    return this.yellow2Red;
  }
  
  public void setYellow2Red(boolean paramBoolean) {
    this.yellow2Red = paramBoolean;
  }
  
  public boolean isRed2Yellow() {
    return this.red2Yellow;
  }
  
  public void setRed2Yellow(boolean paramBoolean) {
    this.red2Yellow = paramBoolean;
  }
  
  public boolean isYellow2Green() {
    return this.yellow2Green;
  }
  
  public void setYellow2Green(boolean paramBoolean) {
    this.yellow2Green = paramBoolean;
  }
}
