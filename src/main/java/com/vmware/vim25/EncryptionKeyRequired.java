package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.EncryptionKeyRequired;
import com.vmware.vim25.InvalidState;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EncryptionKeyRequired", propOrder = {"requiredKey"})
public class EncryptionKeyRequired extends InvalidState {
  protected List<CryptoKeyId> requiredKey;
  
  public List<CryptoKeyId> getRequiredKey() {
    if (this.requiredKey == null)
      this.requiredKey = new ArrayList<>(); 
    return this.requiredKey;
  }
}
