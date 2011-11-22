package ru.mentorbank.backoffice.services.moneytransfer;

import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import ru.mentorbank.backoffice.services.moneytransfer.exceptions.TransferException;
import ru.mentorbank.backoffice.test.AbstractSpringTest;

public class MoneyTransferServiceTest extends AbstractSpringTest {

	@Autowired
	private MoneyTransferServiceBean moneyTransferService;

	@Before
	public void setUp() {
	}

	@Test
	public void transfer() throws TransferException {
		fail("not implemented yet");
		// TODO: ���������� ��������������, ��� ��� �������� �������� ��
		// �������� � ���������� ��� ����������� ������ ��������
		// ����� ������� ����������������� ���������
		// StopListService mockedStopListService =
		// mock(StopListServiceStub.class);
		// AccountService mockedAccountService = mock(AccountServiceBean.class);
		//
		// moneyTransferService.transfer(null);
		//
		// verify(mockedStopListService).getJuridicalStopListInfo(null);
		// verify(mockedAccountService).verifyBalance(null);
	}
}
