Public Class LogCompanyAssignment

    Private Sub LogAssignment_Load(ByVal sender As System.Object, ByVal e As System.EventArgs) Handles MyBase.Load
        'Declared all required class varaibles
        Dim sizeOfLog As Double
        Dim limit As Double

        'Display intro messagebox
        MessageBox.Show("Welcome! Please enter a length of logs you would like.")
        'User input process

        'Display an inputbox for user's input
        sizeOfLog = InputBox("Our choices are the following (in meters); .25, .5 and 1 : ")


        If ((sizeOfLog = 0.25) _
                    OrElse ((sizeOfLog = 0.5) _
                    OrElse (sizeOfLog = 1))) Then
            'Calucating using a provided variable and the user's input
            limit = (1100 / (20 * sizeOfLog))
            'Declare variable to transitation from double to string
            Dim limit1 As String = limit
            Dim sizeOfLog1 As String = sizeOfLog
            'Output the user input's function's value.
            MessageBox.Show("The truck can carry " + limit1 + " logs that are " + sizeOfLog1 + " meters long.")
        Else
            'Output informing the user that the input was not acceptable in the program.
            MessageBox.Show(("Our choices are only .25, .5 and 1 yet, you picked " + (sizeOfLog + "m.")))
        End If
        Close()
    End Sub


End Class
