package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostService;
import com.vmware.vim25.HostServiceSourcePackage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostService", propOrder = {"key", "label", "required", "uninstallable", "running", "ruleset", "policy", "sourcePackage"})
public class HostService extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String label;
  
  protected boolean required;
  
  protected boolean uninstallable;
  
  protected boolean running;
  
  protected List<String> ruleset;
  
  @XmlElement(required = true)
  protected String policy;
  
  protected HostServiceSourcePackage sourcePackage;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getLabel() {
    return this.label;
  }
  
  public void setLabel(String paramString) {
    this.label = paramString;
  }
  
  public boolean isRequired() {
    return this.required;
  }
  
  public void setRequired(boolean paramBoolean) {
    this.required = paramBoolean;
  }
  
  public boolean isUninstallable() {
    return this.uninstallable;
  }
  
  public void setUninstallable(boolean paramBoolean) {
    this.uninstallable = paramBoolean;
  }
  
  public boolean isRunning() {
    return this.running;
  }
  
  public void setRunning(boolean paramBoolean) {
    this.running = paramBoolean;
  }
  
  public List<String> getRuleset() {
    if (this.ruleset == null)
      this.ruleset = new ArrayList<>(); 
    return this.ruleset;
  }
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
  
  public HostServiceSourcePackage getSourcePackage() {
    return this.sourcePackage;
  }
  
  public void setSourcePackage(HostServiceSourcePackage paramHostServiceSourcePackage) {
    this.sourcePackage = paramHostServiceSourcePackage;
  }
}
