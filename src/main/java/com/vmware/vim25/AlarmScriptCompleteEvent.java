package com.vmware.vim25;

import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.AlarmScriptCompleteEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmScriptCompleteEvent", propOrder = {"entity", "script"})
public class AlarmScriptCompleteEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  @XmlElement(required = true)
  protected String script;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
  
  public String getScript() {
    return this.script;
  }
  
  public void setScript(String paramString) {
    this.script = paramString;
  }
}
