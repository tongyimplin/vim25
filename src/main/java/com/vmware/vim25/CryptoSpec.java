package com.vmware.vim25;

import com.vmware.vim25.CryptoSpecDecrypt;
import com.vmware.vim25.CryptoSpecDeepRecrypt;
import com.vmware.vim25.CryptoSpecEncrypt;
import com.vmware.vim25.CryptoSpecNoOp;
import com.vmware.vim25.CryptoSpecShallowRecrypt;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSpec")
@XmlSeeAlso({CryptoSpecDeepRecrypt.class, CryptoSpecEncrypt.class, CryptoSpecShallowRecrypt.class, CryptoSpecDecrypt.class, CryptoSpecNoOp.class})
public class CryptoSpec extends DynamicData {}
