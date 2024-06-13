package com.vmware.vim25;

import com.vmware.vim25.CpuIncompatible;
import com.vmware.vim25.CpuIncompatible1ECX;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CpuIncompatible1ECX", propOrder = {"sse3", "pclmulqdq", "ssse3", "sse41", "sse42", "aes", "other", "otherOnly"})
public class CpuIncompatible1ECX extends CpuIncompatible {
  protected boolean sse3;
  
  protected Boolean pclmulqdq;
  
  protected boolean ssse3;
  
  protected boolean sse41;
  
  protected boolean sse42;
  
  protected Boolean aes;
  
  protected boolean other;
  
  protected boolean otherOnly;
  
  public boolean isSse3() {
    return this.sse3;
  }
  
  public void setSse3(boolean paramBoolean) {
    this.sse3 = paramBoolean;
  }
  
  public Boolean isPclmulqdq() {
    return this.pclmulqdq;
  }
  
  public void setPclmulqdq(Boolean paramBoolean) {
    this.pclmulqdq = paramBoolean;
  }
  
  public boolean isSsse3() {
    return this.ssse3;
  }
  
  public void setSsse3(boolean paramBoolean) {
    this.ssse3 = paramBoolean;
  }
  
  public boolean isSse41() {
    return this.sse41;
  }
  
  public void setSse41(boolean paramBoolean) {
    this.sse41 = paramBoolean;
  }
  
  public boolean isSse42() {
    return this.sse42;
  }
  
  public void setSse42(boolean paramBoolean) {
    this.sse42 = paramBoolean;
  }
  
  public Boolean isAes() {
    return this.aes;
  }
  
  public void setAes(Boolean paramBoolean) {
    this.aes = paramBoolean;
  }
  
  public boolean isOther() {
    return this.other;
  }
  
  public void setOther(boolean paramBoolean) {
    this.other = paramBoolean;
  }
  
  public boolean isOtherOnly() {
    return this.otherOnly;
  }
  
  public void setOtherOnly(boolean paramBoolean) {
    this.otherOnly = paramBoolean;
  }
}
