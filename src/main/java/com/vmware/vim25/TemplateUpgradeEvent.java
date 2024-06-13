package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.TemplateBeingUpgradedEvent;
import com.vmware.vim25.TemplateUpgradeEvent;
import com.vmware.vim25.TemplateUpgradeFailedEvent;
import com.vmware.vim25.TemplateUpgradedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemplateUpgradeEvent", propOrder = {"legacyTemplate"})
@XmlSeeAlso({TemplateUpgradeFailedEvent.class, TemplateUpgradedEvent.class, TemplateBeingUpgradedEvent.class})
public class TemplateUpgradeEvent extends Event {
  @XmlElement(required = true)
  protected String legacyTemplate;
  
  public String getLegacyTemplate() {
    return this.legacyTemplate;
  }
  
  public void setLegacyTemplate(String paramString) {
    this.legacyTemplate = paramString;
  }
}
