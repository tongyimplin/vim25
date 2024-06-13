package com.vmware.vim25;

import com.vmware.vim25.Action;
import com.vmware.vim25.RunScriptAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RunScriptAction", propOrder = {"script"})
public class RunScriptAction extends Action {
  @XmlElement(required = true)
  protected String script;
  
  public String getScript() {
    return this.script;
  }
  
  public void setScript(String paramString) {
    this.script = paramString;
  }
}
