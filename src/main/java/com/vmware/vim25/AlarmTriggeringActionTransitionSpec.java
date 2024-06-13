package com.vmware.vim25;

import com.vmware.vim25.AlarmTriggeringActionTransitionSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmTriggeringActionTransitionSpec", propOrder = {"startState", "finalState", "repeats"})
public class AlarmTriggeringActionTransitionSpec extends DynamicData {
  @XmlElement(required = true)
  protected ManagedEntityStatus startState;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus finalState;
  
  protected boolean repeats;
  
  public ManagedEntityStatus getStartState() {
    return this.startState;
  }
  
  public void setStartState(ManagedEntityStatus paramManagedEntityStatus) {
    this.startState = paramManagedEntityStatus;
  }
  
  public ManagedEntityStatus getFinalState() {
    return this.finalState;
  }
  
  public void setFinalState(ManagedEntityStatus paramManagedEntityStatus) {
    this.finalState = paramManagedEntityStatus;
  }
  
  public boolean isRepeats() {
    return this.repeats;
  }
  
  public void setRepeats(boolean paramBoolean) {
    this.repeats = paramBoolean;
  }
}
