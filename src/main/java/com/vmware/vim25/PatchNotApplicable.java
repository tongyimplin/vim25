package com.vmware.vim25;

import com.vmware.vim25.PatchAlreadyInstalled;
import com.vmware.vim25.PatchMissingDependencies;
import com.vmware.vim25.PatchNotApplicable;
import com.vmware.vim25.PatchSuperseded;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PatchNotApplicable", propOrder = {"patchID"})
@XmlSeeAlso({PatchMissingDependencies.class, PatchSuperseded.class, PatchAlreadyInstalled.class})
public class PatchNotApplicable extends VimFault {
  @XmlElement(required = true)
  protected String patchID;
  
  public String getPatchID() {
    return this.patchID;
  }
  
  public void setPatchID(String paramString) {
    this.patchID = paramString;
  }
}
