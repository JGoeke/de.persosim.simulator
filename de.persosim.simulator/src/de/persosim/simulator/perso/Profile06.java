package de.persosim.simulator.perso;

import de.persosim.simulator.crypto.CryptoUtil;
import de.persosim.simulator.utils.HexString;

/**
 * @author slutters
 *
 */
public class Profile06 extends AbstractProfile {
	
	@Override
	public void setPersoDataContainer() {
		persoDataContainer = PersonalizationDataContainer.getDefaultContainer();
		persoDataContainer.setDg4PlainData("Hans-Günther");
		persoDataContainer.setDg5PlainData("von Drebenbusch-Dalgoßen");
		persoDataContainer.setDg6PlainData("Freiherr zu Möckern-Windensberg");
		persoDataContainer.setDg7PlainData("Dr.eh.Dr.");
		persoDataContainer.setDg8PlainData("19460125");
		persoDataContainer.setDg9PlainData("BREMERHAVEN");
		persoDataContainer.setDg13PlainData("Weiß");
		persoDataContainer.setDg17StreetPlainData("WEG NR. 12 8E");
		persoDataContainer.setDg17CityPlainData("HAMBURG");
		persoDataContainer.setDg17CountryPlainData("D");
		persoDataContainer.setDg17ZipPlainData("22043");
		persoDataContainer.setDg18PlainData("02760200000000");
		persoDataContainer.setDgEfChipSecurity("308208DE06092A864886F70D010702A08208CF308208CB020103310F300D06096086480165030402040500308203B5060804007F0007030201A08203A7048203A33182039F3012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201020101003019060904007F000702020502300C060704007F0007010202010D3017060A04007F0007020205020330090201010201010101003012060A04007F0007020203020202010202012A301C060904007F000702020302300C060704007F0007010202010D02012A3062060904007F0007020201023052300C060704007F0007010202010D0342000467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC202012A3081A3060804007F00070202083181963012060A04007F0007020203020202010202012E301C060904007F000702020302300C060704007F0007010202010D02012E3062060904007F0007020201023052300C060704007F0007010202010D034200043DA77A3738157092849CD540172494F28F76C83EE9B866838A7A8424139858D5496550AC5E4BC7C3932E0DFC7B6CB93CC3C10A07EB73F5AC97FBE9C9BDA50D1B02012E308201C3060804007F0007020207308201B5300B0609608648016503040204308201A43021020101041C2FF0247F59DD3C646E314F03ABB33EE91A586577EBDF48D3864EC34D3021020102041C37823963B71AF0BF5698D1FDC30DA2B7F9ECE57CFA4959BEE9D6D9943021020103041CA105E4EF19FEEC01DC64FBE1AECBEBC2A492DE78C89D439A8C301E853021020104041C3A6A140ED29506B4BD8BC31B9932998567FC3CE257AE6C110BA94A2D3021020105041C8A8DD7E4DC7A7C402D0399D6F35A920C36F98D9BB1ED5430B4AD73413021020106041C767E53DA85E3758E96759D2B93ED1B63AA4B00EEB76CEDCFBB5C7D493021020107041C47EABD1221D9D5C311CEBD0A295603B77ADFF076454005D428403E043021020108041C5DD501132F83A21F8DA912DC0496E3EA8E9487D0B852FC0B31D6D7AA3021020109041C697A58759DAD8D6F34424A838523AF6E1DA32D4C0369A68199B0B1BD302102010D041C7A3C39533C3BF2444FEAB253E66949F39FA540D7780186949CD2732A3021020111041CA24DEF6EFBBF09DC078F2EC99FFD6166C372F5C534B3F642147C5B0A3021020112041CC203D1D96EDF22B34B906EBDD9FD4C84B80C8113BE8D631FE7EA223A302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6CA08203EE308203EA30820371A003020102020119300A06082A8648CE3D0403033055310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369310D300B0603550405130430303033311A301806035504030C115445535420637363612D6765726D616E79301E170D3133303932353130333730355A170D3234303432353233353935395A305C310B3009060355040613024445310C300A060355040A0C03425349310D300B06035504051304303033373130302E06035504030C275445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201133081D406072A8648CE3D02013081C8020101302806072A8648CE3D0101021D00D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF303C041C68A5E62CA9CE6C1C299803A6C1530B514E182AD8B0042A59CAD29F43041C2580F63CCFE44138870713B1A92369E33E2135D266DBB372386C400B0439040D9029AD2C7E5CF4340823B2A87DC68C9E4CE3174C1E6EFDEE12C07D58AA56F772C0726F24C6B89E4ECDAC24354B9E99CAA3F6D3761402CD021D00D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F020101033A000466574635C1765D1D495981E08FDF8E6CC7A8E16604361D434CF6FB59B7BF3D1355587C9C142C39346A93AEC4FE08F8D17C5CD5827E4CCD07A382016D30820169301F0603551D23041830168014A38DB7C0DBECF5A91FCA6B3D5EB2F328B5A5DC17301D0603551D0E04160414A2FC23A1EDA6321C859A77B3B81D7B134CBED4DC300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303133303932353130333730355A810F32303134303432353233353935395A30160603551D20040F300D300B060904007F000703010101302D0603551D1104263024821262756E646573647275636B657265692E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F746573745F637363615F63726C300A06082A8648CE3D04030303670030640230508FB8DC3E8E6D9176052B032E1D237F576A92A9635298FC130675AC95C7858BF437ACBC455616DCA060AB5E6CB12A6602306DC4ED6ADC90D8AAAFB3B132ED4E88B5ECEE07E41C9013CC31927E829DA4A01A84A9AA44E87BCB5ED76C235F6620EE283182010830820104020101305A3055310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369310D300B0603550405130430303033311A301806035504030C115445535420637363612D6765726D616E79020119300D06096086480165030402040500A046301706092A864886F70D010903310A060804007F0007030201302B06092A864886F70D010904311E041C14F3183BA14A892DB37978A8A74CB81AB1128FD57D8E8F69A472B700300A06082A8648CE3D0403010440303E021D00B8D9895DF2F702390E81E9036FF6153980FBE85309D0B0ED89F26766021D00B468A97C15270E0D06E1FEF010970AD054CD6128BF33F19A6C0B9CCA");
		persoDataContainer.setDgEfCardAccess("3181C13012060A04007F0007020204020202010202010D300D060804007F00070202020201023012060A04007F0007020203020202010202012A301C060904007F000702020302300C060704007F0007010202010D02012A303E060804007F000702020831323012060A04007F0007020203020202010202012E301C060904007F000702020302300C060704007F0007010202010D02012E302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6C");
		persoDataContainer.setDgEfCardSecurity("308206B106092A864886F70D010702A08206A23082069E020103310F300D0609608648016503040204050030820188060804007F0007030201A082017A04820176318201723012060A04007F0007020204020202010202010D300D060804007F00070202020201023017060A04007F0007020205020330090201010201020101003019060904007F000702020502300C060704007F0007010202010D3017060A04007F0007020205020330090201010201010101003012060A04007F0007020203020202010202012A301C060904007F000702020302300C060704007F0007010202010D02012A3062060904007F0007020201023052300C060704007F0007010202010D0342000467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC202012A303E060804007F000702020831323012060A04007F0007020203020202010202012E301C060904007F000702020302300C060704007F0007010202010D02012E302A060804007F0007020206161E687474703A2F2F6273692E62756E642E64652F6369662F6E70612E786D6CA08203EE308203EA30820371A003020102020119300A06082A8648CE3D0403033055310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369310D300B0603550405130430303033311A301806035504030C115445535420637363612D6765726D616E79301E170D3133303932353130333730355A170D3234303432353233353935395A305C310B3009060355040613024445310C300A060355040A0C03425349310D300B06035504051304303033373130302E06035504030C275445535420446F63756D656E74205369676E6572204964656E7469747920446F63756D656E7473308201133081D406072A8648CE3D02013081C8020101302806072A8648CE3D0101021D00D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF303C041C68A5E62CA9CE6C1C299803A6C1530B514E182AD8B0042A59CAD29F43041C2580F63CCFE44138870713B1A92369E33E2135D266DBB372386C400B0439040D9029AD2C7E5CF4340823B2A87DC68C9E4CE3174C1E6EFDEE12C07D58AA56F772C0726F24C6B89E4ECDAC24354B9E99CAA3F6D3761402CD021D00D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F020101033A000466574635C1765D1D495981E08FDF8E6CC7A8E16604361D434CF6FB59B7BF3D1355587C9C142C39346A93AEC4FE08F8D17C5CD5827E4CCD07A382016D30820169301F0603551D23041830168014A38DB7C0DBECF5A91FCA6B3D5EB2F328B5A5DC17301D0603551D0E04160414A2FC23A1EDA6321C859A77B3B81D7B134CBED4DC300E0603551D0F0101FF040403020780302B0603551D1004243022800F32303133303932353130333730355A810F32303134303432353233353935395A30160603551D20040F300D300B060904007F000703010101302D0603551D1104263024821262756E646573647275636B657265692E6465A40E300C310A300806035504070C014430510603551D12044A30488118637363612D6765726D616E79406273692E62756E642E6465861C68747470733A2F2F7777772E6273692E62756E642E64652F63736361A40E300C310A300806035504070C01443019060767810801010602040E300C02010031071301411302494430350603551D1F042E302C302AA028A0268624687474703A2F2F7777772E6273692E62756E642E64652F746573745F637363615F63726C300A06082A8648CE3D04030303670030640230508FB8DC3E8E6D9176052B032E1D237F576A92A9635298FC130675AC95C7858BF437ACBC455616DCA060AB5E6CB12A6602306DC4ED6ADC90D8AAAFB3B132ED4E88B5ECEE07E41C9013CC31927E829DA4A01A84A9AA44E87BCB5ED76C235F6620EE283182010830820104020101305A3055310B3009060355040613024445310D300B060355040A0C0462756E64310C300A060355040B0C03627369310D300B0603550405130430303033311A301806035504030C115445535420637363612D6765726D616E79020119300D06096086480165030402040500A046301706092A864886F70D010903310A060804007F0007030201302B06092A864886F70D010904311E041C0E9F2441FF37C0891C6DDBBEEB0C2919CDD48608C1F021BBBDAAB673300A06082A8648CE3D0403010440303E021D00B8D9895DF2F702390E81E9036FF6153980FBE85309D0B0ED89F26766021D00B468A97C15270E0D06E1FEF010970AD054CD6128BF33F19A6C0B9CCA");
		
		String documentNumber = "000000006";
		String sex = "M";
		String mrzLine3 = "VONDREBENBUSCHDALGOSSEN<<HANS<";
		String mrz = persoDataContainer.createMrzFromDgs(documentNumber, sex, mrzLine3);
		
		persoDataContainer.setMrz(mrz);
		persoDataContainer.setEpassDg1PlainData(mrz);
		
		// unprivileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0467DBFBD14C3291267FEFF537062570B96BE2274D7747D734BBDB5BFEAAD0976C3E47B929F42B1FCD583F80FB469225E29FE00AC6C95C24E956CB8E7031C19AC2"),
				HexString.toByteArray("8910074CF4749A916E5864654C768D57F57B6361F70A226DD1AEBED390BB066D")),
				42, false);
		
		// privileged CA key
		persoDataContainer.addCaKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("043DA77A3738157092849CD540172494F28F76C83EE9B866838A7A8424139858D5496550AC5E4BC7C3932E0DFC7B6CB93CC3C10A07EB73F5AC97FBE9C9BDA50D1B"),
				HexString.toByteArray("935E8C1BA669471F87BEC93CF9671AD1A0504B8BFE5E3FB91A72074F4F6ECF45")),
				46, true);

		// individual RI key - 1st sector public/private key pair (Sperrmerkmal)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("041DF62F5438AD5132BF8799295F4B4C4887F21151FC98330193FCBE501D2560F0181BA7E9508C82C27EFD5BDD5499D84E86C442FAF37383FBBF4C104C8E9ED9DF"),
				HexString.toByteArray("0826A30BD682ABF632911F6380C9CF6A65C191DB1C62DCB4A25C1EA023FB6E97")),
				1, false);

		// individual RI key - 2nd sector public/private key pair (Pseudonym)
		persoDataContainer.addRiKeyPair(CryptoUtil.reconstructKeyPair(13,
				HexString.toByteArray("0439036762A5736E37A55D4F4E875CAB87744DB74ADD255BA42C6533729AF1D95AA6AF1B264E53C08CD5FAE58684F462BD2AC6E6CFDFD8ADCB6BA65894439AA6FA"),
				HexString.toByteArray("0640C5FB16B6083DF60DE4A00B231B22ED012FC672E5EE2849CAB6FB93CA947C")),
				2, true);
	}

}
