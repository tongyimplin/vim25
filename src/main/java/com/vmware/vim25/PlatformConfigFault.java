package com.vmware.vim25;

import com.vmware.vim25.HostConfigFault;
import com.vmware.vim25.InvalidBundle;
import com.vmware.vim25.PatchInstallFailed;
import com.vmware.vim25.PatchIntegrityError;
import com.vmware.vim25.PlatformConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlatformConfigFault", propOrder = {"text"})
@XmlSeeAlso({PatchInstallFailed.class, InvalidBundle.class, PatchIntegrityError.class})
public class PlatformConfigFault extends HostConfigFault {
  @XmlElement(required = true)
  protected String text;
  
  public String getText() {
    return this.text;
  }
  
  public void setText(String paramString) {
    this.text = paramString;
  }
}
